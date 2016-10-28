package com.ntsebryk.service;

import com.ntsebryk.dao.Contact;

import java.util.List;

/**
 * Created by ntsebryk on 17.10.2016.
 */
public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
