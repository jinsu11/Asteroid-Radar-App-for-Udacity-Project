package com.udacity.asteroidradar

/* Asteroid Property */
data class AsteroidProperty(
        var near_earth_objects: Map<String, List<OneDayProperty>>
)

data class OneDayProperty(
        var id: String,
        var name: String,
        var absolute_magnitude_h: Double,
        var estimated_diameter: EstimatedDiameter,
        var is_potentially_hazardous_asteroid: Boolean,
        var close_approach_data: List<CloseApproachData>
)

data class EstimatedDiameter(
        var kilometers: Kilometers
)

data class Kilometers(
        var estimated_diameter_max: Double
)

data class CloseApproachData(
        var close_approach_date: String,
        var relative_velocity: RelativeVelocity,
        var miss_distance: MissDistance
)

data class RelativeVelocity(
        var kilometers_per_second: String
)

data class MissDistance(
        var astronomical: String
)