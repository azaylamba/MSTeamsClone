package com.relevel.msteams.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserMessage {

    @Id
    private long message_id;
}
