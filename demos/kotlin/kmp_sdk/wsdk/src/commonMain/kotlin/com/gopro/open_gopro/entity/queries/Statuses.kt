/* Statuses.kt/Open GoPro, Version 2.0 (C) Copyright 2021 GoPro, Inc. (http://gopro.com/OpenGoPro). */
/* This copyright was auto-generated on Tue Feb 18 18:41:29 UTC 2025 */

package com.gopro.open_gopro.operations

/************************************************************************************************************
 *
 *
 * WARNING!!! This file is auto-generated. Do not modify it manually
 *
 *
 */

enum class StatusId(override val value: UByte) : IValuedEnum<UByte> {
    BATTERY_PRESENT(1U),
    INTERNAL_BATTERY_BARS(2U),
    OVERHEATING(6U),
    BUSY(8U),
    QUICK_CAPTURE(9U),
    ENCODING(10U),
    LCD_LOCK(11U),
    VIDEO_ENCODING_DURATION(13U),
    WIRELESS_CONNECTIONS_ENABLED(17U),
    PAIRING_STATE(19U),
    LAST_PAIRING_TYPE(20U),
    LAST_PAIRING_SUCCESS(21U),
    WIFI_SCAN_STATE(22U),
    LAST_WIFI_SCAN_SUCCESS(23U),
    WIFI_PROVISIONING_STATE(24U),
    REMOTE_VERSION(26U),
    REMOTE_CONNECTED(27U),
    PAIRING_STATE_LEGACY_(28U),
    AP_SSID(29U),
    WIFI_SSID(30U),
    CONNECTED_DEVICES(31U),
    PREVIEW_STREAM(32U),
    PRIMARY_STORAGE(33U),
    REMAINING_PHOTOS(34U),
    REMAINING_VIDEO_TIME(35U),
    PHOTOS(38U),
    VIDEOS(39U),
    OTA(41U),
    PENDING_FW_UPDATE_CANCEL(42U),
    LOCATE(45U),
    TIMELAPSE_INTERVAL_COUNTDOWN(49U),
    SD_CARD_REMAINING(54U),
    PREVIEW_STREAM_AVAILABLE(55U),
    WIFI_BARS(56U),
    ACTIVE_HILIGHTS(58U),
    TIME_SINCE_LAST_HILIGHT(59U),
    MINIMUM_STATUS_POLL_PERIOD(60U),
    LIVEVIEW_EXPOSURE_SELECT_MODE(65U),
    LIVEVIEW_Y(66U),
    LIVEVIEW_X(67U),
    GPS_LOCK(68U),
    AP_MODE(69U),
    INTERNAL_BATTERY_PERCENTAGE(70U),
    MICROPHONE_ACCESSORY(74U),
    ZOOM_LEVEL(75U),
    WIRELESS_BAND(76U),
    ZOOM_AVAILABLE(77U),
    MOBILE_FRIENDLY(78U),
    FTU(79U),
    NUM_5GHZ_AVAILABLE(81U),
    READY(82U),
    OTA_CHARGED(83U),
    COLD(85U),
    ROTATION(86U),
    ZOOM_WHILE_ENCODING(88U),
    FLATMODE(89U),
    VIDEO_PRESET(93U),
    PHOTO_PRESET(94U),
    TIMELAPSE_PRESET(95U),
    PRESET_GROUP(96U),
    PRESET(97U),
    PRESET_MODIFIED(98U),
    REMAINING_LIVE_BURSTS(99U),
    LIVE_BURSTS(100U),
    CAPTURE_DELAY_ACTIVE(101U),
    MEDIA_MOD_STATE(102U),
    TIME_WARP_SPEED(103U),
    LINUX_CORE(104U),
    LENS_TYPE(105U),
    HINDSIGHT(106U),
    SCHEDULED_CAPTURE_PRESET_ID(107U),
    SCHEDULED_CAPTURE(108U),
    DISPLAY_MOD_STATUS(110U),
    SD_CARD_WRITE_SPEED_ERROR(111U),
    SD_CARD_ERRORS(112U),
    TURBO_TRANSFER(113U),
    CAMERA_CONTROL_ID(114U),
    USB_CONNECTED(115U),
    USB_CONTROLLED(116U),
    SD_CARD_CAPACITY(117U),
    PHOTO_INTERVAL_CAPTURE_COUNT(118U);

    @ExperimentalUnsignedTypes
    companion object : IUByteArrayCompanion<StatusId> {
        override fun fromUByteArray(value: UByteArray) = entries.first { it.value == value.last() }
    }
}