package com.company.test.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Users;

@UiController("test_Users.browse")
@UiDescriptor("users-browse.xml")
@LookupComponent("usersesTable")
@LoadDataBeforeShow
public class UsersBrowse extends StandardLookup<Users> {
}