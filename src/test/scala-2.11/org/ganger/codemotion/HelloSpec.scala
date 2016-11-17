package org.ganger.codemotion

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class HelloSpec extends FlatSpec with Matchers{

  "This test" should "pass" in {
    true should be (true)
  }
}
