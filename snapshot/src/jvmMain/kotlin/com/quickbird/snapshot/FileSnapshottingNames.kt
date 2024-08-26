package com.quickbird.snapshot

data class FileSnapshottingNames(
    val referenceFilePrefix: String,
    val diffFilePrefix: String,
    val parentDirectory: String,
    val directoryName: String?
) {
    companion object {
        val default = FileSnapshottingNames(
            referenceFilePrefix = "reference",
            diffFilePrefix = "diff",
            parentDirectory = "snapshot",
            directoryName = this::class.simpleName
        )
    }
}
