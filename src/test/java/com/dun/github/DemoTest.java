package com.dun.github;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

  @Test
  void test_github_action_demo() {
    assertEquals(520, new Demo().getDemo());
  }
}
