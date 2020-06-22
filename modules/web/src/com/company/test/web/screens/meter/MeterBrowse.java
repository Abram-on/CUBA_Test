package com.company.test.web.screens.meter;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Meter;

@UiController("test_Meter.browse")
@UiDescriptor("meter-browse.xml")
@LookupComponent("metersTable")
@LoadDataBeforeShow
public class MeterBrowse extends StandardLookup<Meter> {
}