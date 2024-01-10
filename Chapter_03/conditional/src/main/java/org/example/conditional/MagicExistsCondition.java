package org.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    Environment env = context.getEnvironment();
    return env.containsProperty("magic");//Check for “magic” property
  }

  //From the ConditionContext, you can do the following:
  // Check for bean definitions via the BeanDefinitionRegistry returned from
  //getRegistry().
  // Check for the presence of beans, and even dig into bean properties via the
  //ConfigurableListableBeanFactory returned from getBeanFactory().
  // Check for the presence and values of environment variables via the Environment
  //retrieved from getEnvironment().
  // Read and inspect the contents of resources loaded via the ResourceLoader
  //returned from getResourceLoader().
  // Load and check for the presence of classes via the ClassLoader returned from
  //getClassLoader()
}
