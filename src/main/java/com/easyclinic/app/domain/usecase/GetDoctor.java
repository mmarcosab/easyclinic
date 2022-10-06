package com.easyclinic.app.domain.usecase;

import java.util.List;

public interface GetDoctor {
    Object byId();
    List<Object> all();
}
