package gmail

import (
    "fmt"
    "log"
    //"os"
    //"time"
    "cloud.google.com/go/pubsub"
    "golang.org/x/net/context"
    //"google.golang.org/api/option"
    "google.golang.org/api/iterator"
    "sync"
)

func receiveEmails() {
    //now tht the gmail api has been setup to send messages from greg label to sub id, get messages

    googleProjectId := "apiservice-1606168155272"
    googleSubscriptionName := "gmailSubscribe"
    topicName := "igTradingTopic"

    var mu sync.Mutex
    received := 0
    ctx := context.Background()
    //pwd, _ := os.Getwd()
    clientPubSub, err := pubsub.NewClient(ctx, googleProjectId)
    if err != nil {
        log.Fatalf("Could not create pubsub Client: %v", err)
    }
    //work on the topic
    fmt.Printf("Topic is 1: %q\n")
    t := clientPubSub.Topic(topicName)
    fmt.Printf("Topic is 2: %q\n")
    ok, err := t.Exists(ctx)
        if err != nil {
            log.Fatal(err)
        }
    fmt.Printf("Topic is there: %q\n", ok)

    fmt.Printf("Topic is 3: %q\n")
    sub := clientPubSub.Subscription(googleSubscriptionName)
    cctx, cancel := context.WithCancel(ctx)
    //messagePull, err := pullMsgs(client, googleSubscriptionName, topicName)
    err = sub.Receive(cctx, func(ctx context.Context, msg *pubsub.Message) {
            mu.Lock()
            defer mu.Unlock()
            fmt.Printf("Got message: %q\n", string(msg.Data))
            msg.Ack()
            received++
            if received == 10 {
                    cancel()
            }
    })
    if err != nil {
            log.Fatalf("Receive: %v", err)
    }
    /* ctx := context.Background()

    // Get the project ID from envvar.
    proj := os.Getenv("GOOGLE_CLOUD_PROJECT")
    if proj == "" {
        fmt.Fprintf(os.Stderr, "GOOGLE_CLOUD_PROJECT environment variable must be set.\n")
        os.Exit(1)
    }

    // Create a pubsub client.
    pwd, _ := os.Getwd()
    client, err := pubsub.NewClient(ctx, proj, option.WithServiceAccountFile(pwd + "/sub-test/lush-global-soa-architecture-edbe7150a322.json"))
    if err != nil {
        log.Fatalf("Could not create pubsub Client: %v", err)
    }

    // Print all the subscriptions in the project.
    fmt.Println("Listing all subscriptions from the project:")
    subs, err := listSub(client)
    if err != nil {
        log.Fatal(err)
    }
    for _, sub := range subs {
        fmt.Println(sub)
    }

    t := createTopicIfNotExists(client)

    // Create a new subscription.
    const sub = "example-subscription"
    if err := createSub(client, sub, t); err != nil {
        fmt.Printf("Could not create subscription: %v\n", err)
    } */

    // Pull messages via the subscription.
    /* if err := pullMsgs(clientPubSub, googleSubscriptionName, t); err != nil {
        log.Fatal(err)
    } */

    // Delete the subscription.
    /* if err := delete(client, sub); err != nil {
        log.Fatal(err)
    } */
}

// createTopicIfNotExists - Creates a new topic if it does not exist.
//
// Params:
//     c *pubsub.Client - The pub sub client.
//
// Return:
//     *pubsub.Topic - The topic.
func createTopicIfNotExists(c *pubsub.Client) *pubsub.Topic {
    ctx := context.Background()

    const topic = "epos.transaction.created"

    // Check if the topic already exists.
    t := c.Topic(topic)
    ok, err := t.Exists(ctx)
    if err != nil {
        log.Fatal(err)
    }
    if ok {
        return t
    }

    // Create a topic to subscribe to.
    t, err = c.CreateTopic(ctx, topic)
    if err != nil {
        fmt.Printf("Could not create topic: %v\n", err)
    }
    return t
}

// createSub - Create a new pubsub subscription.
//
// Params:
//     client *pubsub.Client - The pubsub client.
//     name string - The name of the subscription to create.
//     topic *pubsub.Topic - The topic to subscribe to.
//
// Return:
//     error - An error if it occured or nil.
/* func createSub(client *pubsub.Client, name string, topic *pubsub.Topic) error {
    ctx := context.Background()

    sub, err := client.CreateSubscription(ctx, name, topic, 20*time.Second, nil)
    if err != nil {
        return err
    }
    fmt.Printf("Created subscription: %v\n", sub)

    return nil
} */

// listSub - Lists all available pubsub subcriptions for a client.
//
// Params
//     client *pubsub.Client - The pub sub client.
//
// Return
//     []*pubsub.Subscription - Array of subscriptions.
func listSub(client *pubsub.Client) ([]*pubsub.Subscription, error) {
    ctx := context.Background()

    var subs []*pubsub.Subscription
    it := client.Subscriptions(ctx)

    for {
        s, err := it.Next()
        if err == iterator.Done {
            break
        }

        if err != nil {
            return nil, err
        }

        subs = append(subs, s)
    }

    return subs, nil
}

// pullMsgs - Get 10 messages for a given pubsub topic.
//
// Params:
//     client *pubsub.Client - The pubsub client.
//     name string - The name of the subscription to use.
//     topic *pubsub.Topic - The topic to get messages from.
//
// Return:
//     error - An error if it occured or nil.
/* func pullMsgs(client *pubsub.Client, name string, topic *pubsub.Topic) error {
    ctx := context.Background()

    // Get the subscription.
    sub := client.Subscription(name)
    it, err := sub.Pull(ctx)
    if err != nil {
        return err
    }
    defer it.Stop()

    // Consume messages.
    for {
        msg, err := it.Next()
        if err == iterator.Done {
            break
        }
        if err != nil {
            return err
        }

        fmt.Printf("Got message: %q\n", string(msg.Data))
        msg.Done(true)
    }

    return nil
} */

// delete - Delete a subcription.
//
// Params:
//     client *pubsub.Client - The pubsub client.
//     name string - The name of the subscription to delete.
//
// Return:
//     error - An error if it occured or nil.
func delete(client *pubsub.Client, name string) error {
    ctx := context.Background()

    sub := client.Subscription(name)
    if err := sub.Delete(ctx); err != nil {
        return err
    }
    fmt.Println("Subscription deleted.")

    return nil
}