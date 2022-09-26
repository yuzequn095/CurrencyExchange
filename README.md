#### Currency Exchange Microservices
http://localhost:8000/currency-exchange/from/XX/to/XX

#### Currency Conversion Microservices
http://localhost:8100/currency-conversion/from/XX/to/XX/quantity/XX

#### Eureka
Naming Server

#### LoadBalancer
Replace Ribbon in latest version
Talk to Eureka to pick up microservices instance

#### Feign
REST Client for Service Invocation - call another microservices
Let Currency Conversion call Currency Exchange

#### Circuit Breaker - Resilience4j
Fallback response when a service is down

#### API Gateway
Discovery Locator with Eureka for Gateway

#### Database
H2 & JPA

#### Docker & Kubernetes
