package com.vertex.service;

import com.vertex.model.LendingBooks;

public interface BookLendingService {

    void addNewLend(long id,boolean availability);

    void showAvailability(long id);

}
