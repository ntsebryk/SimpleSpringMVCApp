package com.ntsebryk.repository;

import com.ntsebryk.dao.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ntsebryk on 17.10.2016.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
