package com.rohan.discordclone.socket.model.message;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "messages")
public class Message {

	@PrimaryKeyColumn(name="coversation_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String conversationId;
	
	@Column("message_id")
	@CassandraType(type = Name.TEXT)
	private String messageId;

//	userID of the user who sent the message
	@Column("author_id")
	@CassandraType(type = Name.TEXT)
	private String authorId;

	@Column("author_username")
	@CassandraType(type = Name.TEXT)
	private String authorUsername;

	@Column("content")
	@CassandraType(type = Name.TEXT)
	private String content;

//	@Column("date")
//	@CassandraType(type = Name.TEXT)
	@PrimaryKeyColumn(name="date", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private String date;

//	Whether a Direct Message or a Group Message
	@Column("type")
	@CassandraType(type = Name.TEXT)
	private String type;

	public Message(String conversationId, String messageId, String authorId, String authorUsername, String content,
			String date, String type) {
		super();
		this.conversationId = conversationId;
		this.messageId = messageId;
		this.authorId = authorId;
		this.authorUsername = authorUsername;
		this.content = content;
		this.date = date;
		this.type = type;
	}

	public Message(String messageId, String authorId, String authorUsername, String content, String date, String type) {
		super();
		this.messageId = messageId;
		this.authorId = authorId;
		this.authorUsername = authorUsername;
		this.content = content;
		this.date = date;
		this.type = type;
	}

	public Message() {
		super();
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorUsername() {
		return authorUsername;
	}

	public void setAuthorUsername(String authorUsername) {
		this.authorUsername = authorUsername;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

//	@JsonDeserialize(using = LocalDateSerializer.class)
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
