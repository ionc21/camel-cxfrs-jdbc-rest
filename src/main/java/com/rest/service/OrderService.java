package com.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.domain.FulfillmentResponse;
import com.rest.domain.OrderRequest;
import com.rest.generated.Order;

/**
 * Main resource service provider for orders. Services are available through the
 * path /orderFulfillment.
 *
 * @author Michael Hoffman, Pluralsight
 *
 */
@Path("/orderFulfillment")
public class OrderService {

	/**
	 * Processing an order request. Simply writes out the order request to
	 * System.err and then returns a fulfillment response object with the status
	 * code 200 and status as success.
	 *
	 * @param orderRequest
	 * @return
	 */
	@POST
	@Path("/processOrders")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FulfillmentResponse processOrders(OrderRequest orderRequest) {
		System.err.println(orderRequest);
		FulfillmentResponse response = new FulfillmentResponse(200, "Success!");
		return response;
	}

	@POST
	@Path("/processXmlOrders")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public FulfillmentResponse processXmlOrders(Order order) {
		System.err.println(order);
		FulfillmentResponse response = new FulfillmentResponse(200, "Success!");
		return response;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void ping(Order order) {
		System.out.println(order);
	}
}
