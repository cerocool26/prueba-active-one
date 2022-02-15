package com.pruebatecnica.active.mapping;

import com.pruebatecnica.active.model.Cd;
import com.pruebatecnica.active.request.RequestCd;

public interface CdMapper {


    Cd getCdForCreated(RequestCd requestCd);

    Cd getCdForUpdated(Cd cd, RequestCd requestCd);

}
