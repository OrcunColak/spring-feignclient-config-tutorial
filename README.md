# Read me

The original idea is from  
https://medium.com/@deepugeorge2007travel/feign-client-with-api-gateway-9ee9ffb995a0#b60e

This example shows how to use configuration with Feign Client. The configuration enables Feign Client logging

# @FeignClient value attribute

The value attribute is used to specify the name of the target microservice or the logical name by which the client will
refer to the service. This logical name is used for service discovery and load balancing. For example

```
@FeignClient(value = "student-service")
```

# @FeignClient url attribute

The url attribute specifies the URL directly. For example

```
@FeignClient(url = "http://localhost:4000", value = "student-service")
```

# @FeignClient path attribute

The path attribute in a @FeignClient annotation in Spring Cloud is used to specify a prefix that will be prepended to
all request mappings defined in the associated interface.

This can be useful when you want to group and organize related
API endpoints under a common path. For example

```
@FeignClient(value = "student-service", path = "api/students/")
```

# @FeignClient configuration  attribute

In the context of a Feign client in Spring Cloud, the configuration attribute in the @FeignClient annotation allows you
to specify a configuration class or classes that customize the behavior of the Feign client. This can be useful when you
need to fine-tune aspects of the client, such as connection timeouts, request/response interceptors, error handling,
etc. For example

```
@FeignClient(value = "student-service", configuration = MyFeignClientConfiguration.class)
```