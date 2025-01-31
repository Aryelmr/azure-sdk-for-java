// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import java.util.List;
import com.azure.core.util.CoreUtils;

/**
 * The configuration information for an audio transcription request.
 */
@Fluent
public final class AudioTranscriptionOptions {

    /*
     * The audio data to transcribe. This must be the binary content of a file in one of the supported media formats:
     * flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, webm.
     */
    private final byte[] file;

    /*
     * The requested format of the transcription response data, which will influence the content and detail of the result.
     */
    @Generated
    private AudioTranscriptionFormat responseFormat;

    /*
     * The primary spoken language of the audio data to be transcribed, supplied as a two-letter ISO-639-1 language code
     * such as 'en' or 'fr'.
     * Providing this known input language is optional but may improve the accuracy and/or latency of transcription.
     */
    @Generated
    private String language;

    /*
     * An optional hint to guide the model's style or continue from a prior audio segment. The written language of the
     * prompt should match the primary spoken language of the audio data.
     */
    @Generated
    private String prompt;

    /*
     * The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain thresholds are hit.
     */
    @Generated
    private Double temperature;

    /*
     * The model to use for this transcription request.
     */
    @Generated
    private String model;

    /**
     * Get the file property: The audio data to transcribe. This must be the binary content of a file in one of the
     * supported media formats:
     * flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, webm.
     *
     * @return the file value.
     */
    public byte[] getFile() {
        return CoreUtils.clone(this.file);
    }

    /**
     * Get the responseFormat property: The requested format of the transcription response data, which will influence
     * the content and detail of the result.
     *
     * @return the responseFormat value.
     */
    @Generated
    public AudioTranscriptionFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The requested format of the transcription response data, which will influence
     * the content and detail of the result.
     *
     * @param responseFormat the responseFormat value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setResponseFormat(AudioTranscriptionFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * Get the language property: The primary spoken language of the audio data to be transcribed, supplied as a
     * two-letter ISO-639-1 language code
     * such as 'en' or 'fr'.
     * Providing this known input language is optional but may improve the accuracy and/or latency of transcription.
     *
     * @return the language value.
     */
    @Generated
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The primary spoken language of the audio data to be transcribed, supplied as a
     * two-letter ISO-639-1 language code
     * such as 'en' or 'fr'.
     * Providing this known input language is optional but may improve the accuracy and/or latency of transcription.
     *
     * @param language the language value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the prompt property: An optional hint to guide the model's style or continue from a prior audio segment. The
     * written language of the
     * prompt should match the primary spoken language of the audio data.
     *
     * @return the prompt value.
     */
    @Generated
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Set the prompt property: An optional hint to guide the model's style or continue from a prior audio segment. The
     * written language of the
     * prompt should match the primary spoken language of the audio data.
     *
     * @param prompt the prompt value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * Get the temperature property: The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused
     * and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain
     * thresholds are hit.
     *
     * @return the temperature value.
     */
    @Generated
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused
     * and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain
     * thresholds are hit.
     *
     * @param temperature the temperature value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the model property: The model to use for this transcription request.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model to use for this transcription request.
     *
     * @param model the model value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /*
     * The optional filename or descriptive identifier to associate with with the audio data.
     */
    @Generated
    private String filename;

    /**
     * Get the filename property: The optional filename or descriptive identifier to associate with with the audio data.
     *
     * @return the filename value.
     */
    @Generated
    public String getFilename() {
        return this.filename;
    }

    /**
     * Set the filename property: The optional filename or descriptive identifier to associate with with the audio data.
     *
     * @param filename the filename value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Creates an instance of AudioTranscriptionOptions class.
     *
     * @param file the file value to set.
     */
    public AudioTranscriptionOptions(byte[] file) {
        this.file = file;
    }

    /*
     * The timestamp granularities to populate for this transcription.
     * `response_format` must be set `verbose_json` to use timestamp granularities.
     * Either or both of these options are supported: `word`, or `segment`.
     * Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.
     */
    @Generated
    private List<AudioTranscriptionTimestampGranularity> timestampGranularities;

    /**
     * Get the timestampGranularities property: The timestamp granularities to populate for this transcription.
     * `response_format` must be set `verbose_json` to use timestamp granularities.
     * Either or both of these options are supported: `word`, or `segment`.
     * Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional
     * latency.
     *
     * @return the timestampGranularities value.
     */
    @Generated
    public List<AudioTranscriptionTimestampGranularity> getTimestampGranularities() {
        return this.timestampGranularities;
    }

    /**
     * Set the timestampGranularities property: The timestamp granularities to populate for this transcription.
     * `response_format` must be set `verbose_json` to use timestamp granularities.
     * Either or both of these options are supported: `word`, or `segment`.
     * Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional
     * latency.
     *
     * @param timestampGranularities the timestampGranularities value to set.
     * @return the AudioTranscriptionOptions object itself.
     */
    @Generated
    public AudioTranscriptionOptions
        setTimestampGranularities(List<AudioTranscriptionTimestampGranularity> timestampGranularities) {
        this.timestampGranularities = timestampGranularities;
        return this;
    }
}
