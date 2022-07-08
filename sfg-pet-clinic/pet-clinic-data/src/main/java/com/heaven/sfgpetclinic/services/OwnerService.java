package com.heaven.sfgpetclinic.services;

import com.heaven.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
