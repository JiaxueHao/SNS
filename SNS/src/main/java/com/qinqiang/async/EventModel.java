package com.nowcoder.async;

import sun.java2d.pipe.hw.AccelDeviceEventNotifier;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class EventModel {
    private EventType type;//事件
    private int actorId;//事件发起人
    private int entityType;//事件类型
    private int entityId;//事件ID
    private int entityOwnerId;//事件相关对象

    private Map<String, String> exts = new HashMap<String, String>();

    public EventModel() {

    }

    public EventModel setExt(String key, String value) {
        exts.put(key, value);
        return this;
    }

    public EventModel(EventType type) {
        this.type = type;
    }

    public String getExt(String key) {
        return exts.get(key);
    }


    public EventType getType() {
        return type;
    }

    public EventModel setType(EventType type) {
        this.type = type;
        return this;
    }

    public int getActorId() {
        return actorId;
    }

    public EventModel setActorId(int actorId) {
        this.actorId = actorId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public EventModel setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public EventModel setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityOwnerId() {
        return entityOwnerId;
    }

    public EventModel setEntityOwnerId(int entityOwnerId) {
        this.entityOwnerId = entityOwnerId;
        return this;
    }

    public Map<String, String> getExts() {
        return exts;
    }

    public EventModel setExts(Map<String, String> exts) {
        this.exts = exts;
        return this;
    }
}
