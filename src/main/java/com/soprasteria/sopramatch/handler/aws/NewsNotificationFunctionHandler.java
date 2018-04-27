package com.soprasteria.sopramatch.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;

public class NewsNotificationFunctionHandler extends SpringBootRequestHandler<ServerlessRequest, ServerlessResponse<?>> {
}
