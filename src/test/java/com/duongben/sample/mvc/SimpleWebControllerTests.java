/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duongben.sample.mvc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleWebControllerTests {

	@Test
	public void test() {
		SimpleWebController controller = new SimpleWebController();
		assertEquals("Greetings!", controller.greet());
	}
}
