package tech.valery;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void ShouldCreateNewUser(){
        User user = new User("Susan");
    }
}
