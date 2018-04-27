define([
    { field: 'factoryName', title: '名称', sortable: true, halign: 'center' },
    { field: 'factoryAdd', title: '地址', sortable: true, halign: 'center' },
    { field: 'contno', title: '电话', sortable: true, halign: 'center' },
    { field: 'remake', title: '备注', sortable: true, halign: 'center' },
    { field: 'action', title: '操作', halign: 'center', align: 'center', formatter: actionFormatter, events: 'factoryNameActionEvents', clickToSelect: false }
]);

function actionFormatter(value, row, index) {
    return [
        '<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
        '<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>'
    ].join('');
}
