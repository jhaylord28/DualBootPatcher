// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Request extends Table {
  public static Request getRootAsRequest(ByteBuffer _bb) { return getRootAsRequest(_bb, new Request()); }
  public static Request getRootAsRequest(ByteBuffer _bb, Request obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Request __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte requestType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table request(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o) : null; }

  public static int createRequest(FlatBufferBuilder builder,
      byte request_type,
      int requestOffset) {
    builder.startObject(2);
    Request.addRequest(builder, requestOffset);
    Request.addRequestType(builder, request_type);
    return Request.endRequest(builder);
  }

  public static void startRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addRequestType(FlatBufferBuilder builder, byte requestType) { builder.addByte(0, requestType, 0); }
  public static void addRequest(FlatBufferBuilder builder, int requestOffset) { builder.addOffset(1, requestOffset, 0); }
  public static int endRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

