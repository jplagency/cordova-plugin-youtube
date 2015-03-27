var YouTube = function () {};

YouTube.prototype.playVideo = function (videoId, startTimeMillis, autoplay, lightboxMode, success, error) {
  return cordova.exec(function (args) {
      success(args);
  }, function (args) {
      error(args);
  }, 'YouTube', 'playVideo', [ videoId, startTimeMillis, autoplay, lightboxMode ]);
};

if (!window.plugins) {
  window.plugins = {};
}
if (!window.plugins.youtube) {
  window.plugins.youtube = new YouTube();
}
