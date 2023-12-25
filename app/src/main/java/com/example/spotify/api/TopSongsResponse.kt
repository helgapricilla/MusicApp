package com.example.spotify.api

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class TopSongsResponse(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem2?>? = null
) : Parcelable

@Parcelize
data class Artist(

	@field:SerializedName("tracklist")
	val tracklist: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("type")
	val type: String? = null
) : Parcelable

@Parcelize
data class Album(

	@field:SerializedName("cover")
	val cover: String? = null,

	@field:SerializedName("md5_image")
	val md5Image: String? = null,

	@field:SerializedName("tracklist")
	val tracklist: String? = null,

	@field:SerializedName("cover_xl")
	val coverXl: String? = null,

	@field:SerializedName("cover_medium")
	val coverMedium: String? = null,

	@field:SerializedName("cover_small")
	val coverSmall: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("cover_big")
	val coverBig: String? = null
) : Parcelable

@Parcelize
data class DataItem2(

	@field:SerializedName("readable")
	val readable: Boolean? = null,

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("md5_image")
	val md5Image: String? = null,

	@field:SerializedName("artist")
	val artist: Artist? = null,

	@field:SerializedName("album")
	val album: Album? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("explicit_content_cover")
	val explicitContentCover: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("title_version")
	val titleVersion: String? = null,

	@field:SerializedName("explicit_lyrics")
	val explicitLyrics: Boolean? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title_short")
	val titleShort: String? = null,

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("explicit_content_lyrics")
	val explicitContentLyrics: Int? = null,

	@field:SerializedName("contributors")
	val contributors: List<ContributorsItem?>? = null
) : Parcelable

@Parcelize
data class ContributorsItem(

	@field:SerializedName("picture_xl")
	val pictureXl: String? = null,

	@field:SerializedName("tracklist")
	val tracklist: String? = null,

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("picture_small")
	val pictureSmall: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("picture")
	val picture: String? = null,

	@field:SerializedName("radio")
	val radio: Boolean? = null,

	@field:SerializedName("picture_big")
	val pictureBig: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("share")
	val share: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("picture_medium")
	val pictureMedium: String? = null
) : Parcelable
