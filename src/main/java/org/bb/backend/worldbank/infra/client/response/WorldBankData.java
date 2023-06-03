package org.bb.backend.worldbank.infra.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorldBankData {

    private Metadata metadata;
    private List<DataPoint> data;

}