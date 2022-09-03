package com.example.adobootleg.rest.adapters;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class QueryParamToSortAdapter {

    public Sort toSort(String queryParam) {
        Sort sort = Sort.by(Sort.Order.desc("CreationDate"));
        String[] parsedQueryParam = queryParam.split(":", 2);
        String orderBy = parsedQueryParam[0];
        String order = "asc";
        if (parsedQueryParam.length > 1) order = parsedQueryParam[1].toLowerCase();
        if (order.equals("asc")) {
            sort = Sort.by(Sort.Order.asc(orderBy));
        } else {
            sort = Sort.by(Sort.Order.desc(orderBy));
        }
        return sort;
    }

    public Sort toSort(String queryParam, String defaultSortField) {
        Sort sort = Sort.by(Sort.Order.desc(defaultSortField));
        String[] parsedQueryParam = queryParam.split(":", 2);
        String orderBy = parsedQueryParam[0];
        String order = "asc";
        if (parsedQueryParam.length > 1) order = parsedQueryParam[1].toLowerCase();
        if (order.equals("asc")) {
            sort = Sort.by(Sort.Order.asc(orderBy));
        } else {
            sort = Sort.by(Sort.Order.desc(orderBy));
        }
        return sort;
    }
}
