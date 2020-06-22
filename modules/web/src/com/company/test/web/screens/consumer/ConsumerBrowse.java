package com.company.test.web.screens.consumer;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Consumer;

@UiController("test_Consumer.browse")
@UiDescriptor("consumer-browse.xml")
@LookupComponent("consumersTable")
@LoadDataBeforeShow
public class ConsumerBrowse extends StandardLookup<Consumer> {

/*    @Subscribe("consumersTable")
    public void onConsumersTableSelection(Table.SelectionEvent<Consumer> event) {


    }
*/
    @Subscribe(id = "consumersDc", target = Target.DATA_CONTAINER)
    public void onConsumersDcItemChange(InstanceContainer.ItemChangeEvent<Consumer> event) {
        Label ml;
        if (event.getItem() != null) {
            ml = (Label) getWindow().getComponent("meterIndication");
            if (ml != null) {
                ml.setValue("Current indication of meter(" + event.getItem().getMeter().getSerialNum().toString() + "): "+ event.getItem().getMeter().getCurrentIndication().toString());
            } else {
                ml.setValue("");
            }

        }
    }
}