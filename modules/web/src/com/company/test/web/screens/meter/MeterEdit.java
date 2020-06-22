package com.company.test.web.screens.meter;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Meter;

@UiController("test_Meter.edit")
@UiDescriptor("meter-edit.xml")
@EditedEntityContainer("meterDc")
@LoadDataBeforeShow
public class MeterEdit extends StandardEditor<Meter> {
}