package com.contact.service;

import com.contact.entity.Contact;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
//fake list of Contacts
  List<Contact> list=List.of(
      new Contact(1L,"durgesh@gmail.com","Durgesh",1311L),
    new Contact(2L,"ankita@gmail.com","Ankita",1312L),
    new Contact(3L,"aman@gmail.com","Aman",1313L),
    new Contact(4L,"arjun@gmail.com","Arjun",1314L)
);
  @Override
  public List<Contact> getContactsOfUser(Long userId) {
    return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
  }
}
