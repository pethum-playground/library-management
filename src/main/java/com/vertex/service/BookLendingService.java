package com.vertex.service;

import com.vertex.model.LendingBooks;

public interface BookLendingService {

    void addNewLend(LendingBooks book);

    void showAvailability(LendingBooks book);

}
