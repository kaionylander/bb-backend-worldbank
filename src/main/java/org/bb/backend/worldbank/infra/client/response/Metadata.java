package org.bb.backend.worldbank.infra.client.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Metadata {
    private Integer page;
    private Integer pages;
    private Integer per_page;
    private Integer total;
    private String sourceid;
    private String lastupdated;

}