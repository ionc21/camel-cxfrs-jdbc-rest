package com.rest.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration for Apache Camel. Extends CamelConfiguration as this
 * class loads up the CamelContext along with the Spring Context.
 *
 * @author Michael Hoffman, Pluralsight
 */
@Configuration
public class IntegrationConfig {

	// @Autowired
	// private Environment environment;
	//
	// @Bean
	// public javax.jms.ConnectionFactory jmsConnectionFactory() {
	// return new org.apache.activemq.ActiveMQConnectionFactory(environment.getProperty("activemq.broker.url"));
	// }
	//
	// @Bean(initMethod = "start", destroyMethod = "stop")
	// public org.apache.activemq.pool.PooledConnectionFactory pooledConnectionFactory() {
	// PooledConnectionFactory factory = new PooledConnectionFactory();
	// factory.setConnectionFactory(jmsConnectionFactory());
	// factory.setMaxConnections(Integer.parseInt(environment.getProperty("pooledConnectionFactory.maxConnections")));
	// return factory;
	// }
	//
	// @Bean
	// public org.apache.camel.component.jms.JmsConfiguration jmsConfiguration() {
	// JmsConfiguration jmsConfiguration = new JmsConfiguration();
	// jmsConfiguration.setConnectionFactory(pooledConnectionFactory());
	// return jmsConfiguration;
	// }
	//
	// @Bean
	// public org.apache.activemq.camel.component.ActiveMQComponent activeMq() {
	// ActiveMQComponent activeMq = new ActiveMQComponent();
	// activeMq.setConfiguration(jmsConfiguration());
	// return activeMq;
	// }

}
