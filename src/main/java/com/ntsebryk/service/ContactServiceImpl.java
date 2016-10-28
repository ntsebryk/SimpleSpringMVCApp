package com.ntsebryk.service;

import com.google.common.collect.Lists;
import com.ntsebryk.dao.Contact;
import com.ntsebryk.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ntsebryk on 17.10.2016.
 */
@Repository
@Transactional
@Service("contactService")
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    @Autowired
    public void setContractContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Transactional
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Transactional
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }
}
