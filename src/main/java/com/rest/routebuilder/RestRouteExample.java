package com.rest.routebuilder;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component("restRouteExample")
public class RestRouteExample extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs://http://localhost:9090?resourceClasses=com.rest.service.OrderService&bindingStyle=Default").beanRef("fulfillmentCenterOneProcessor",
				"transformToOrderRequestMessage").log("My HttpResponse = ${body}")
		// .setHeader(org.apache.camel.Exchange.CONTENT_TYPE, constant("application/json"))
		// .to("cxfrs://http://localhost:9090?resourceClasses=com.rest.service.OrderService&bindingStyle=Default")
		;
	}
}