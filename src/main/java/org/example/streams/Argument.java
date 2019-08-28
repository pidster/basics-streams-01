package org.example.streams;

import java.util.StringJoiner;

public class Argument {

    private final String name;

    private final Object value;

    private final Class<?> type;

    public Argument(String name, Object value, Class<?> type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Class<?> getType() {
        return type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Argument.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("value=" + value)
            .add("type=" + type)
            .toString();
    }
}
