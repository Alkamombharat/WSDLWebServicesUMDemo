/**
 * 
 */
package com.mkyong.ws;

import javax.xml.ws.Endpoint;

/**
 * @author jwawdhanei
 *
 */
//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
  }

}