package com.coso.emeter.adminapp.utilobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

        private String perm_name;
        private boolean perm_value;

}
