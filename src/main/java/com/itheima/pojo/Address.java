package com.itheima.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "address", type = "docs", shards = 1, replicas = 0)

  @Data                    //索引库名     类型          分片数量        副本数量
public class Address {
    @Id
    private Integer id;

    private String loc;

    private String username;

}
