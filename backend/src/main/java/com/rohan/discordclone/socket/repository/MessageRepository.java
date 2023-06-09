package com.rohan.discordclone.socket.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.rohan.discordclone.socket.model.message.Message;

public interface MessageRepository extends CassandraRepository<Message, String> {

	List<Message> findAllByConversationId(String conversationId);

}
