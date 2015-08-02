package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Config extends BserObject {

    private int maxGroupSize;

    public Config(int maxGroupSize) {
        this.maxGroupSize = maxGroupSize;
    }

    public Config() {

    }

    public int getMaxGroupSize() {
        return this.maxGroupSize;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.maxGroupSize = values.getInt(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.maxGroupSize);
    }

    @Override
    public String toString() {
        String res = "struct Config{";
        res += "maxGroupSize=" + this.maxGroupSize;
        res += "}";
        return res;
    }

}
