APP REST API
===

This API exposes for

    - Get Products
    - Get Transactions
    

Installation
---
    * you need docker to be installed
    * npm install

Scripts
---

* `npm run start` - start docker Container for REST APIs
* `npm run start:dev` - start docker Container for REST APIs in DEV Mode
* `npm run test:unit` - runs the unit tests under /src folder
* `npm run test:integration` - runs the integration tests against the locally running server
* `npm run test:coverage` - runs the coverage under /src
* `npm run test` - runs the all(unit test, lint and coverage) under /src

Technologies Used
---
    * Koa, middlware, helmet, ES6, Lint, Swagger, 
    * Mocha, report, supertest, testdouble
    * MSQL, Docker, nodemoon, logger

Test
---
    * Unit test, 100% coverages
    * Int Test , all flows of end points
    * Reports