package com.company.test.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.test.entity.Users;

@UiController("test_Users.edit")
@UiDescriptor("users-edit.xml")
@EditedEntityContainer("usersDc")
@LoadDataBeforeShow
public class UsersEdit extends StandardEditor<Users> {
}