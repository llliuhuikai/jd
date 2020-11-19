package com.bjpowernode;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class Es1ApplicationTests {
@Autowired
	RestHighLevelClient restHighLevelClient;
	@Test
	void textCreateIndex() throws IOException {

		CreateIndexRequest request=new CreateIndexRequest("kuang");
		CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
		System.out.println(createIndexResponse);

	}
	@Test
	void testExistIndex() throws IOException {
		GetIndexRequest request=new GetIndexRequest("kuang");
		boolean exist= restHighLevelClient.indices().exists(request,RequestOptions.DEFAULT);
		System.out.println(exist);
	}

}
