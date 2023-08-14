package com.kmutswairo.composenavigationdemo.data

import kotlinx.coroutines.delay

class DataProvider {

    val sampleData = listOf(
        SampleDataDto(
            id = 1,
            title = "Title 1",
            description = "Description 1",
        ),
        SampleDataDto(
            id = 2,
            title = "Title 2",
            description = "Description 2",
        ),
        SampleDataDto(
            id = 3,
            title = "Title 3",
            description = "Description 3",
        ),
        SampleDataDto(
            id = 4,
            title = "Title 4",
            description = "Description 4",
        ),
        SampleDataDto(
            id = 5,
            title = "Title 5",
            description = "Description 5",
        ),
        SampleDataDto(
            id = 6,
            title = "Title 6",
            description = "Description 6",
        ),
        SampleDataDto(
            id = 7,
            title = "Title 7",
            description = "Description 7",
        ),
        SampleDataDto(
            id = 8,
            title = "Title 8",
            description = "Description 8",
        ),
        SampleDataDto(
            id = 9,
            title = "Title 9",
            description = "Description 9",
        ),
        SampleDataDto(
            id = 10,
            title = "Title 10",
            description = "Description 10",
        ),
        SampleDataDto(
            id = 11,
            title = "Title 11",
            description = "Description 11",
        ),
        SampleDataDto(
            id = 12,
            title = "Title 12",
            description = "Description 12",
        ),
        SampleDataDto(
            id = 13,
            title = "Title 13",
            description = "Description 13",
        ),
        SampleDataDto(
            id = 14,
            title = "Title 14",
            description = "Description 14",
        ),
        SampleDataDto(
            id = 15,
            title = "Title 15",
            description = "Description 15",
        ),
        SampleDataDto(
            id = 16,
            title = "Title 16",
            description = "Description 16",
        ),
        SampleDataDto(
            id = 17,
            title = "Title 17",
            description = "Description 17",
        ),
    )

    suspend fun getSampleData(): List<SampleDataDto> {
        delay(3000L)
        return sampleData
    }
}
