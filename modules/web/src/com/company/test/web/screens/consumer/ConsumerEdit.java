package com.company.test.web.screens.consumer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Consumer;

@UiController("test_Consumer.edit")
@UiDescriptor("consumer-edit.xml")
@EditedEntityContainer("consumerDc")
@LoadDataBeforeShow
public class ConsumerEdit extends StandardEditor<Consumer> {
}