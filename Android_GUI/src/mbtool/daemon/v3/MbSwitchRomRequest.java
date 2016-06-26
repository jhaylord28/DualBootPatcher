// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbSwitchRomRequest extends Table {
  public static MbSwitchRomRequest getRootAsMbSwitchRomRequest(ByteBuffer _bb) { return getRootAsMbSwitchRomRequest(_bb, new MbSwitchRomRequest()); }
  public static MbSwitchRomRequest getRootAsMbSwitchRomRequest(ByteBuffer _bb, MbSwitchRomRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbSwitchRomRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String romId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer romIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String bootBlockdev() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer bootBlockdevAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String blockdevBaseDirs(int j) { int o = __offset(8); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int blockdevBaseDirsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public boolean forceUpdateChecksums() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createMbSwitchRomRequest(FlatBufferBuilder builder,
      int rom_idOffset,
      int boot_blockdevOffset,
      int blockdev_base_dirsOffset,
      boolean force_update_checksums) {
    builder.startObject(4);
    MbSwitchRomRequest.addBlockdevBaseDirs(builder, blockdev_base_dirsOffset);
    MbSwitchRomRequest.addBootBlockdev(builder, boot_blockdevOffset);
    MbSwitchRomRequest.addRomId(builder, rom_idOffset);
    MbSwitchRomRequest.addForceUpdateChecksums(builder, force_update_checksums);
    return MbSwitchRomRequest.endMbSwitchRomRequest(builder);
  }

  public static void startMbSwitchRomRequest(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addRomId(FlatBufferBuilder builder, int romIdOffset) { builder.addOffset(0, romIdOffset, 0); }
  public static void addBootBlockdev(FlatBufferBuilder builder, int bootBlockdevOffset) { builder.addOffset(1, bootBlockdevOffset, 0); }
  public static void addBlockdevBaseDirs(FlatBufferBuilder builder, int blockdevBaseDirsOffset) { builder.addOffset(2, blockdevBaseDirsOffset, 0); }
  public static int createBlockdevBaseDirsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBlockdevBaseDirsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addForceUpdateChecksums(FlatBufferBuilder builder, boolean forceUpdateChecksums) { builder.addBoolean(3, forceUpdateChecksums, false); }
  public static int endMbSwitchRomRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

