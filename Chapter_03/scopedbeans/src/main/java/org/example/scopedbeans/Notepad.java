package org.example.scopedbeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope("singleton")
public class Notepad {
  // the details of this class are inconsequential to this example
}
