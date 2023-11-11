package com.bassure.in.rr.app.model.program;

import com.bassure.in.rr.app.model.ResponseHeader;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramResponse {
    private ResponseHeader header;
    private ProgramResponseBody body;
}
