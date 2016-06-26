// automatically generated by the FlatBuffers compiler, do not modify

#ifndef FLATBUFFERS_GENERATED_MBWIPEROM_MBTOOL_DAEMON_V3_H_
#define FLATBUFFERS_GENERATED_MBWIPEROM_MBTOOL_DAEMON_V3_H_

#include "flatbuffers/flatbuffers.h"


namespace mbtool {
namespace daemon {
namespace v3 {

struct MbWipeRomRequest;
struct MbWipeRomResponse;

enum MbWipeTarget {
  MbWipeTarget_SYSTEM = 0,
  MbWipeTarget_CACHE = 1,
  MbWipeTarget_DATA = 2,
  MbWipeTarget_DALVIK_CACHE = 3,
  MbWipeTarget_MULTIBOOT = 4,
  MbWipeTarget_MIN = MbWipeTarget_SYSTEM,
  MbWipeTarget_MAX = MbWipeTarget_MULTIBOOT
};

inline const char **EnumNamesMbWipeTarget() {
  static const char *names[] = { "SYSTEM", "CACHE", "DATA", "DALVIK_CACHE", "MULTIBOOT", nullptr };
  return names;
}

inline const char *EnumNameMbWipeTarget(MbWipeTarget e) { return EnumNamesMbWipeTarget()[static_cast<int>(e)]; }

struct MbWipeRomRequest FLATBUFFERS_FINAL_CLASS : private flatbuffers::Table {
  enum {
    VT_ROM_ID = 4,
    VT_TARGETS = 6
  };
  const flatbuffers::String *rom_id() const { return GetPointer<const flatbuffers::String *>(VT_ROM_ID); }
  const flatbuffers::Vector<int16_t> *targets() const { return GetPointer<const flatbuffers::Vector<int16_t> *>(VT_TARGETS); }
  bool Verify(flatbuffers::Verifier &verifier) const {
    return VerifyTableStart(verifier) &&
           VerifyField<flatbuffers::uoffset_t>(verifier, VT_ROM_ID) &&
           verifier.Verify(rom_id()) &&
           VerifyField<flatbuffers::uoffset_t>(verifier, VT_TARGETS) &&
           verifier.Verify(targets()) &&
           verifier.EndTable();
  }
};

struct MbWipeRomRequestBuilder {
  flatbuffers::FlatBufferBuilder &fbb_;
  flatbuffers::uoffset_t start_;
  void add_rom_id(flatbuffers::Offset<flatbuffers::String> rom_id) { fbb_.AddOffset(MbWipeRomRequest::VT_ROM_ID, rom_id); }
  void add_targets(flatbuffers::Offset<flatbuffers::Vector<int16_t>> targets) { fbb_.AddOffset(MbWipeRomRequest::VT_TARGETS, targets); }
  MbWipeRomRequestBuilder(flatbuffers::FlatBufferBuilder &_fbb) : fbb_(_fbb) { start_ = fbb_.StartTable(); }
  MbWipeRomRequestBuilder &operator=(const MbWipeRomRequestBuilder &);
  flatbuffers::Offset<MbWipeRomRequest> Finish() {
    auto o = flatbuffers::Offset<MbWipeRomRequest>(fbb_.EndTable(start_, 2));
    return o;
  }
};

inline flatbuffers::Offset<MbWipeRomRequest> CreateMbWipeRomRequest(flatbuffers::FlatBufferBuilder &_fbb,
   flatbuffers::Offset<flatbuffers::String> rom_id = 0,
   flatbuffers::Offset<flatbuffers::Vector<int16_t>> targets = 0) {
  MbWipeRomRequestBuilder builder_(_fbb);
  builder_.add_targets(targets);
  builder_.add_rom_id(rom_id);
  return builder_.Finish();
}

struct MbWipeRomResponse FLATBUFFERS_FINAL_CLASS : private flatbuffers::Table {
  enum {
    VT_SUCCEEDED = 4,
    VT_FAILED = 6
  };
  const flatbuffers::Vector<int16_t> *succeeded() const { return GetPointer<const flatbuffers::Vector<int16_t> *>(VT_SUCCEEDED); }
  const flatbuffers::Vector<int16_t> *failed() const { return GetPointer<const flatbuffers::Vector<int16_t> *>(VT_FAILED); }
  bool Verify(flatbuffers::Verifier &verifier) const {
    return VerifyTableStart(verifier) &&
           VerifyField<flatbuffers::uoffset_t>(verifier, VT_SUCCEEDED) &&
           verifier.Verify(succeeded()) &&
           VerifyField<flatbuffers::uoffset_t>(verifier, VT_FAILED) &&
           verifier.Verify(failed()) &&
           verifier.EndTable();
  }
};

struct MbWipeRomResponseBuilder {
  flatbuffers::FlatBufferBuilder &fbb_;
  flatbuffers::uoffset_t start_;
  void add_succeeded(flatbuffers::Offset<flatbuffers::Vector<int16_t>> succeeded) { fbb_.AddOffset(MbWipeRomResponse::VT_SUCCEEDED, succeeded); }
  void add_failed(flatbuffers::Offset<flatbuffers::Vector<int16_t>> failed) { fbb_.AddOffset(MbWipeRomResponse::VT_FAILED, failed); }
  MbWipeRomResponseBuilder(flatbuffers::FlatBufferBuilder &_fbb) : fbb_(_fbb) { start_ = fbb_.StartTable(); }
  MbWipeRomResponseBuilder &operator=(const MbWipeRomResponseBuilder &);
  flatbuffers::Offset<MbWipeRomResponse> Finish() {
    auto o = flatbuffers::Offset<MbWipeRomResponse>(fbb_.EndTable(start_, 2));
    return o;
  }
};

inline flatbuffers::Offset<MbWipeRomResponse> CreateMbWipeRomResponse(flatbuffers::FlatBufferBuilder &_fbb,
   flatbuffers::Offset<flatbuffers::Vector<int16_t>> succeeded = 0,
   flatbuffers::Offset<flatbuffers::Vector<int16_t>> failed = 0) {
  MbWipeRomResponseBuilder builder_(_fbb);
  builder_.add_failed(failed);
  builder_.add_succeeded(succeeded);
  return builder_.Finish();
}

}  // namespace v3
}  // namespace daemon
}  // namespace mbtool

#endif  // FLATBUFFERS_GENERATED_MBWIPEROM_MBTOOL_DAEMON_V3_H_
