// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Response extends Table {
  public static Response getRootAsResponse(ByteBuffer _bb) { return getRootAsResponse(_bb, new Response()); }
  public static Response getRootAsResponse(ByteBuffer _bb, Response obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Response __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte responseType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table response(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o) : null; }

  public static int createResponse(FlatBufferBuilder builder,
      byte response_type,
      int responseOffset) {
    builder.startObject(2);
    Response.addResponse(builder, responseOffset);
    Response.addResponseType(builder, response_type);
    return Response.endResponse(builder);
  }

  public static void startResponse(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addResponseType(FlatBufferBuilder builder, byte responseType) { builder.addByte(0, responseType, 0); }
  public static void addResponse(FlatBufferBuilder builder, int responseOffset) { builder.addOffset(1, responseOffset, 0); }
  public static int endResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishResponseBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

